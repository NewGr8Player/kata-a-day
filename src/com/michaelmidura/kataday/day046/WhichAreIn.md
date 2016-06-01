<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #46: Which are in?</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [WhichAreIn.java](WhichAreIn.java)
* <b>Test Class:</b> [WhichAreInTest.java](WhichAreInTest.java)
* <b>Solved:</b> Monday, June 1<sup>st</sup>, 2016

<b>Description:</b>

Given two arrays of strings <code>a1</code> and <code>a2</code> return a sorted array <code>r</code> in lexicographical order and without duplicates of the strings of a1 which are substrings of strings of a2.

<b>Example 1:</b>

<code>a1 = ["arp", "live", "strong"]</code>

<code>a2 = ["lively", "alive", "harp", "sharp", "armstrong"]</code>

returns <code>["arp", "live", "strong"]</code>

<b>Example 2:</b>

<code>a1 = ["tarp", "mice", "bull"]</code>

<code>a2 = ["lively", "alive", "harp", "sharp", "armstrong"]</code>

returns <code>[]</code>

<b>Notes:</b>

Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.

Beware: <code>r</code> must be without duplicates but translators to Haskell and then to Coffeescript and Python introduced duplicates in <code>a1</code>. Don't worry about duplicates in <code>a1</code> in the other languages.