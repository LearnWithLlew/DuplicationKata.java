package org.learnwithllew.duplicationkata;

public class Lesson21 extends Song
{
  public void singSong(int style, String... names)
  {
    switch (style)
    {
      case 1 :
        for (String name : names)
        {
          if (name.startsWith("L"))
          {
            sing("Hip Hip Horray! For " + name);
          }
          else
          {
            sing("Hello " + name + ", it's nice to meet you.");
          }
        }
        break;
      case 2 :
        for (String name : names)
        {
          if (name.startsWith("S"))
          {
            sing("Say yeah! Say yo! Say " + name);
          }
          else
          {
            sing("Hello " + name + ", it's nice to meet you.");
          }
        }
        break;
      case 3 :
        for (String name : names)
        {
          sing("Hello " + name + ", it's nice to meet you.");
        }
        break;
    }
    // loop over text
    // special if first
    // loop over text 
    // special different
    // loop over text
    // no special
  }
}
