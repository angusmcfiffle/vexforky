package ui

import com.soywiz.korge.scene.Module
import com.soywiz.korinject.AsyncInjector
import com.soywiz.korma.geom.*
import level.LevelTemplate
import level.levels
import physics.Vector
import ui.level.LevelScene
import ui.worldMap.WorldMapScene
import worldMap.Exit
import worldMap.WorldMapManager

const val WINDOW_SIZE = 800
const val VIRTUAL_SIZE = 640

object MainModule : Module() {
//    override val mainScene = LevelScene::class
    override val mainScene = WorldMapScene::class
    override val title: String = "Vex"
    override val size: SizeInt = SizeInt(Size(VIRTUAL_SIZE, VIRTUAL_SIZE))
    override val windowSize = SizeInt(Size(WINDOW_SIZE, WINDOW_SIZE))
    override val icon: String = "levels/small.png"
    override val scaleMode: ScaleMode = ScaleMode.SHOW_ALL
    override val clipBorders: Boolean = false
    override val scaleAnchor: Anchor = Anchor.TOP_LEFT

    override suspend fun AsyncInjector.configure() {
        mapPrototype { LevelTemplate(0, "Start", "test") }
        mapPrototype { LevelScene(get(), get()) }
        mapPrototype { WorldMapManager.worldMap.exits.first() }
        mapPrototype { WorldMapScene(get()) }
    }
}