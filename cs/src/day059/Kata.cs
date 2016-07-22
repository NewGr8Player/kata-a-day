namespace src.day059
{
  public class Kata
  {
    public static string DoubleChar(string s)
    {
      string ret = "";
      foreach (char c in s) ret += ("" + c + c);
      return ret;
    }
  }
}