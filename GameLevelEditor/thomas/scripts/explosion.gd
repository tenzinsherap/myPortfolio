extends Particles2D

func on_explosion_timer_timeout() -> void:
	queue_free()
