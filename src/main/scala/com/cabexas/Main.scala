package com.cabexas

import cats.effect.IOApp
import cats.effect.{ExitCode, IO}

object Main extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = 
  IO(println("Hello")).as(ExitCode.Success)

  
}
