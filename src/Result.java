/**
 * TODO: Read through this code carefully because your cache in 
 * SequenceAligner will be made up of Result objects, and a Result 
 * contains a field of type Direction.
 * 
 * A Result represents the result of a subproblem that is stored
 * in the cache.
 */

public class Result {
  /** 
   * The subproblem score. 
   */
  private int score;          
  
  /**  
   * The direction of the neighboring entry in the cache from which this
   * entry is extended. (See definition of Direction below.)
   */
  private Direction parent;   
  
  /**
   * A flag indicating whether or not this subproblem is along the optimal
   * path.
   */
  private boolean mark = false;
  
  /**
   * Creates an unmarked result with the given score and no parent.
   */
  public Result(int score) {
    this(score, Direction.NONE);
  }

  /**
   * Creates an umarked result with the given score and parent.
   */
  public Result(int score, Direction parent) {
    this.score = score; 
    this.parent = parent;
  }

  /**
   * Returns the score associated with this result.
   */
  public int getScore() {
    return score;
  }

  /**
   * Returns the parent associated with this result.
   */
  public Direction getParent() {
    return parent;
  }

  /**
   * Marks this result as being along the optimal path.
   */
  public void markPath() {
    mark = true;
  }

  /**
   * Returns true iff this result is known to be along the optimal path.
   */
  public boolean onPath() {
    return mark;
  }

  /**
   * Returns a textual representation of this result.
   */
  public String toString() {
    String ans = "Result[score=" + score + ",parent=" + parent;
    if (onPath())
      ans += ",*";
    return ans + "]";
  }
}

/**
 * We use this enumeration to represent the direction of the parent result
 * along the optimal path. If the largest score comes from an M operation
 * (i.e., a match or a mismatch), then the direction is DIAGONAL. If the
 * largest score comes from an I operation (i.e., a gap is inserted into
 * strand x), then the direction to the parent is UP. If the largest score
 * comes from a D operation (i.e., a gap is inserted into strand y), then
 * the direction to the parent is LEFT.
 */

enum Direction { 
  DIAGONAL { 
    public String toString() {
      return "diag";
    }
  }, 
  LEFT { 
    public String toString() {
      return "left";
    }
  }, 
  UP { 
    public String toString() {
      return "up";
    }
  },
  NONE { 
    public String toString() {
      return "";
    }
  };
}
