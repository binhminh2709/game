
package com.game.util.text;
  
final public class CharacterSet {
  
  /**Khoảng chống*/
  final static public char[] BLANK = { ' ', '\t', 160 };
  
  /**Giong mới*/
  final static public char[] NEW_LINE = { '\n', '\f', '\r', '\0', 13 };
  
  /**Dấu ngoặc, hoặc thanh chống*/
  final static public char[] BRACKET = { '(', ')', '[', ']', '{', '}', '<', '>' };
  
  /**Sự chấm câu*/
  final static public char[] PUNCTUATION = {
      //apostrophe - dấu nháy đơn
      '\'', '’',
      //Brackets - dấu ngoặc.
      '(', ')', '[', ']', '{', '}', '<', '>',
      //colon - dấu hai chấm
      ':',
      //comma - dấu phẩy
      ',',
      //dashes - nét gạch
      '‒', '–', '—', '―',
      //exclamation mark - dấu chấm than  
      '!',
      //full stop (period)  
      '.',
      //guillemets  
      '«', '»',
      //hyphen - dấu gạch nối
      '-', '‐',
      //question mark - dấu hỏi
      '?',
      //quotation marks   
      '"', '\'', '‘', '’', '“', '”',
      //semicolon   
      ';',
      //slash/stroke  
      '/', '\\',
      //solidus   
      '⁄',
      //percent
      '%' };

  final static public char[] QUOTTATION = { '"', '\'', '‘', '’', '“', '”', '«', '»' };
  final static public char[] END_SENTENCE = { '.', '!', '?', ';', '…' };

  static public boolean isDigit(char c) {
    if (c >= '0' && c <= '9')
      return true;
    return false;
  }

  static public boolean isBlank(char c) {
    if (c == ' ' || c == '\t' || c == 160)
      return true;
    return false;
  }

  static public boolean isNewLine(char c) {
    if (c == '\n' || c == '\f' || c == '\r' || c == '\0' || c == 13)
      return true;
    return false;
  }

  public final static boolean isPunctuation(char c) {
    //apostrophe
    if (c == '\'' || c == '’')
      return true;
    //Brackets
    if (c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}'
        || c == '<' || c == '>')
      return true;
    //colon
    if (c == ':')
      return true;
    //comma
    if (c == ',')
      return true;
    //dashes
    if (c == '‒' || c == '–' || c == '—' || c == '―')
      return true;
    //exclamation mark  
    if (c == '!')
      return true;
    //full stop (period)  
    if (c == '.')
      return true;
    //guillemets  
    if (c == '«' || c == '»')
      return true;
    //hyphen  
    if (c == '-' || c == '‐')
      return true;
    //question mark   
    if (c == '?')
      return true;
    //quotation marks   
    if (c == '"' || c == '\'' || c == '‘' || c == '’' || c == '“' || c == '”')
      return true;
    //semicolon   
    if (c == ';')
      return true;
    //slash/stroke  
    if (c == '/' || c == '\\')
      return true;
    //solidus   
    if (c == '⁄')
      return true;
    //percent
    if (c == '%')
      return true;
    return false;
  }

  final static public boolean isEndSentence(char c) {
    if (c == '.' || c == '!' || c == '?' || c == ';')
      return true;
    return false;
  }

  final static public boolean isBracket(char c) {
    if (c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}'
        || c == '<' || c == '>')
      return true;
    return false;
  }

  final static public boolean isQuotationMark(char c) {
    if (c == '"' || c == '\'' || c == '‘' || c == '’' || c == '“' || c == '”')
      return true;
    return false;
  }

  final static public boolean isGuillemets(char c) {
    if (c == '«' || c == '»')
      return true;
    return false;
  }

  final static public boolean isIn(char c, char[] set) {
    for (char sel : set)
      if (c == sel)
        return true;
    return false;
  }

  final static public char[] merge(char[]... set) {
    int size = 0;
    for (char[] sel : set)
      size += sel.length;
    char[] holder = new char[size];
    int idx = 0;
    for (char[] sel : set) {
      for (char selchar : sel) {
        holder[idx++] = selchar;
      }
    }
    return holder;
  }

  final static public boolean isWLetter(String string) {
    if (string == null)
      return false;
    for (int i = 0; i < string.length(); i++) {
      if (!Character.isLetter(string.charAt(i)))
        return false;
    }
    return true;
  }

  final static public boolean isDigits(String string) {
    if (string == null)
      return false;
    for (int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);
      if (c < '0' || c > '9')
        return false;
    }
    return true;
  }
}
