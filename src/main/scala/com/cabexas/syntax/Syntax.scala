package com.cabexas.syntax

import cats.effect.IO
import cats.effect.Timer

object Syntax {
  
    implicit class IOops[A](private val ioa: IO[A]) {
        def debug(implicit timer: Timer[IO]) = {
            for {
                a <- ioa
                now <- timer.clock.instantNow
                threadName = Thread.currentThread().getName()
                _ <- IO(println(s"[$now][$threadName] $a"))
            } yield a
        }
    }
}
