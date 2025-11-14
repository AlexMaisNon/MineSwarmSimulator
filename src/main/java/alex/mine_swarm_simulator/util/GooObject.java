package alex.mine_swarm_simulator.util;

import org.jetbrains.annotations.Nullable;

public class GooObject {
	private int radius;
	private float duration;
	@Nullable private String owner;

	public GooObject(int radius, float duration, @Nullable String owner) {
		this.radius = radius;
		this.duration = duration;
		this.owner = owner;
	}

	public int getRadius() {
		return radius;
	}

	public float getDuration() {
		return duration;
	}

	public @Nullable String getOwner() {
		return owner;
	}

	public void setRadius(int value) {
		this.radius = value;
	}

	public void setDuration(float value) {
		this.duration = value;
	}

	public void setOwner(@Nullable String value) {
		this.owner = value;
	}
}
