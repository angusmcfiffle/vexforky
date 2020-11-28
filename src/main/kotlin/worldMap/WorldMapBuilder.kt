package worldMap

import level.Levels
import physics.Vector

object WorldMapBuilder {
    val world1 = buildWorld()

    private fun buildWorld(): WorldMap {
        val levels = listOf(
                LevelWrapper(Levels.levels[0]!!, Vector(0,0)),
                LevelWrapper(Levels.levels[1]!!, Vector(10,0))
        ).associateBy { it.level.id }

        val connections = listOf(
                Connection(0, 255, 1,0, levels)
        )

        return WorldMap(levels, connections)
    }

}