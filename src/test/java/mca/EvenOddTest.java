package mca;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddTest
{
@Test
public void testEvenNumber()
{
EvenOddCheck obj = new EvenOddCheck();
String result = obj.checkEvenOdd(4);
Assert.assertEquals(result, "Even");
}

@Test
public void testOddNumber()
{
EvenOddCheck obj = new EvenOddCheck();
String result = obj.checkEvenOdd(7);
Assert.assertEquals(result, "Odd");
}
}
