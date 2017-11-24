import javax.swing.SwingUtilities;

/**
 * This is the main entry point for the application. When run, a GUI will
 * appear showing the cache table for a pair of randomly generated DNA
 * strands.
 * 
 * Go ahead and experiment with different sizes in the constructor for
 * SequenceAligner (i.e., replace the 12 with larger values).
 * 
 * Features of the GUI:
 *   Mouse over the nucleotides to see which character in which strand
 *   they each correspond to. Note that strand x is the vertical one in
 *   the leftmost column and strand y is the horizontal one in the top
 *   row of the grid.
 *   
 *   There is a context-sensitive menu attached to each nucleotide.
 *   Right click it to make the menu appear. Then you can select a new 
 *   nucleotide for this position in the strand.
 *   
 *   Once you have completed the methods in SequenceAligner to align
 *   the DNA strands, the aligned strands will appear in the control
 *   panel and you will be able to highlight the path in the grid by
 *   selecting 'Show path'. Furthermore, each cache entry will show 
 *   a tooltip that indicates the direction you take to get to its
 *   parent.
 */

public class Driver {

  public static void main(String... args) {
    System.out.println(Constants.TITLE);
    System.out.println("Start the GUI...");
    SequenceAligner pair = new SequenceAligner(6);
    System.out.println(pair);
    SwingUtilities.invokeLater(() -> new GUI(pair));

    // DELETE THIS FROM STARTER:
    // Testing.generateTestSuite(Constants.SUITE_FILENAME);
  } 

}
