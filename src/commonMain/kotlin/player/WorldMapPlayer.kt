package player

import physics.Rectangle
import worldMap.Exit

class WorldMapPlayer(origin: Exit) {
    var currentExit = origin
    var goalExit = origin
    val bounds = Rectangle(origin.bounds.x, origin.bounds.y, 0.6f, 0.8f)


    fun update(deltaTime: Float) {
        processKeys()
//        updateState(deltaTime)
//        body.update(deltaTime, xMaxVelocity(), yMaxVelocity())

        //if current and goal don't match, move to goal
        //on arrival set current to goal

    }

    fun setPosition(exit: Exit) {
        currentExit = exit
        goalExit = exit
        bounds.x = exit.bounds.x
        bounds.y = exit.bounds.y
    }

    private fun processKeys() {
//        if (Controller.jump.isFirstPressed()) {
//            if (currentExit == goalExit) {
//                Vex.enterLevel(currentExit)
//            }
//        }
//
//        val desiredAngle = Controller.getLeftStickAngle()
        // get connection with angle nearest to controller
        // set goal to that location
    }


}