package alex.mine_swarm_simulator.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.ArrayList;
import java.util.List;

public record PassivesComponent(List<Passive> passives) {
	public static final Codec<PassivesComponent> CODEC = Passive.CODEC.listOf().xmap(PassivesComponent::new, PassivesComponent::passives);

	public record Passive(String id, short amount, short max, long cooldownTick) {
		public static final Codec<Passive> CODEC = RecordCodecBuilder.create(builder -> builder.group(
			Codec.STRING.fieldOf("id").forGetter(Passive::id),
			Codec.SHORT.fieldOf("amount").forGetter(Passive::amount),
			Codec.SHORT.fieldOf("max").forGetter(Passive::max),
			Codec.LONG.fieldOf("cooldown").forGetter(Passive::cooldownTick)
		).apply(builder, Passive::new));

		public String getTranslationKey() {
			return "passive.mine_swarm_simulator." + this.id;
		}

		public Passive updatePassive(int amount, long cooldownTick) {
			return new Passive(this.id, (short)amount, this.max, cooldownTick);
		}
	}

	public PassivesComponent updatePassive(String id, int amount) {
		List<Passive> passiveList = new ArrayList<>();
		this.passives.forEach(passive -> {
			if(passive.id.equals(id)){
				passiveList.add(passive.updatePassive(amount, passive.cooldownTick()));
			} else {
				passiveList.add(passive);
			}
		});
		return new PassivesComponent(passiveList);
	}

	public PassivesComponent updatePassive(String id, long cooldownTick) {
		List<Passive> passiveList = new ArrayList<>();
		this.passives.forEach(passive -> {
			if(passive.id.equals(id)){
				passiveList.add(passive.updatePassive(passive.amount(), cooldownTick));
			} else {
				passiveList.add(passive);
			}
		});
		return new PassivesComponent(passiveList);
	}

	public PassivesComponent updatePassive(String id, int amount, long cooldownTick) {
		List<Passive> passiveList = new ArrayList<>();
		this.passives.forEach(passive -> {
			if(passive.id.equals(id)){
				passiveList.add(passive.updatePassive(amount, cooldownTick));
			} else {
				passiveList.add(passive);
			}
		});
		return new PassivesComponent(passiveList);
	}
}
