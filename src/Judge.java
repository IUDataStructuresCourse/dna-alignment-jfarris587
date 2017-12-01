/**
 * This class is used to score alignments. 
 * 
 * TODO: You are to implement the two score() methods.
 *  
 */

public class Judge {

  public static final int DEFAULT_MATCH_COST = 2;
  public static final int DEFAULT_MISMATCH_COST = -2;
  public static final int DEFAULT_GAP_COST = -1;
  
  private int matchCost, mismatchCost, gapCost;
  
  /**
   * Creates the default judge.
   */
  public Judge() {
    this(DEFAULT_MATCH_COST, DEFAULT_MISMATCH_COST, DEFAULT_GAP_COST);
  }
  
  /**
   * Creates a judge using the specified costs.
   */
  public Judge(int matchCost, int mismatchCost, int gapCost) {
    this.matchCost = matchCost;
    this.mismatchCost = mismatchCost;
    this.gapCost = gapCost;
  }
  
  /**
   * Returns the gap cost used by this judge.
   */
  public int getGapCost() {
    return gapCost;
  }
  
  /**
   * Returns the match cost used by this judge.
   */
  public int getMatchCost() {
    return matchCost;
  }
  
  /**
   * Returns the mismatch cost used by this judge.
   */
  public int getMismatchCost() {
    return mismatchCost;
  }
  
  /**
   * TODO
   * 
   * Returns the score associated with the two characters.
   */
  public int score(char a, char b) {
    if(a == '_' | b == '_'){
      return getGapCost();
    }

    else if(a == b){
      return getMatchCost();
    }

    else{
      return getMismatchCost();
    }
  }
  
  /**
   * TODO
   * 
   * Returns the score associated with the two strings.
   */
  public int score(String s1, String s2) {
      int scores = 0;
      char[] s1char = s1.toCharArray();
      char[] s2char = s2.toCharArray();
      for(int i = 0; i < s1.length(); i++){
        scores += score(s1char[i], s2char[i]);
      }

      return scores;
  }
}













