package org.learnwithllew.duplicationkata.tests;

import org.approvaltests.Approvals;
import org.junit.Test;
import org.learnwithllew.duplicationkata.Lesson1Straight;
import org.learnwithllew.duplicationkata.Lesson2Variable;
import org.learnwithllew.duplicationkata.Lesson3HigherOrderFunctions;

public class RegressionTest
{
  @Test
  public void testCat()
  {
    Lesson1Straight song = new Lesson1Straight();
    song.singCatSong();
    Approvals.verify(song.song);
  }
  @Test
  public void testBeer()
  {
    Lesson2Variable song = new Lesson2Variable();
    song.singBottlesOfBeer();
    Approvals.verify(song.song);
  }
  @Test
  public void testNumbers()
  {
    Lesson3HigherOrderFunctions song = new Lesson3HigherOrderFunctions();
    song.singCheers();
    Approvals.verify(song.song);
  }
}
