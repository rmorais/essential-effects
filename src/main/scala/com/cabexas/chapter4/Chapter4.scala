package com.cabexas.chapter4

import cats.effect.IO
import com.cabexas.syntax.Syntax._
import cats.effect.IOApp
import cats.effect.ExitCode
import cats.implicits._

object Chapter4 extends IOApp {

    def run(args: List[String]): IO[ExitCode] = {
        val hello = IO("Hello").debug
        val world = IO("world").debug

        (hello, world).mapN((h,w) => s"$h $w").debug.as(ExitCode.Success).debug
    }



//   def myParMap2[A, B, C](ioa: IO[A], iob: IO[B])(f: (A, B) => C): IO[C] = {
//     for {
//         a <- ioa.start
//         b <- iob.start
//     } yield ???
//   }
}
