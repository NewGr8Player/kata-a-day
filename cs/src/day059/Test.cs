namespace src.day059
{
  using NUnit.Framework;
  using System;
  using System.Text.RegularExpressions;

  [TestFixture]
  public class Test
  {
    [Test]
    [TestCase("abcd", Result = "aabbccdd")]
    [TestCase("Adidas", Result = "AAddiiddaass")]
    [TestCase("1337", Result = "11333377")]
    [TestCase("illuminati", Result = "iilllluummiinnaattii")]
    [TestCase("123456", Result = "112233445566")]
    [TestCase("%^&*(", Result = "%%^^&&**((")]
    public static string FixedTest(string s)
    {
      return Kata.DoubleChar(s);
    }
  }
}