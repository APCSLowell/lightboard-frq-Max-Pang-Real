public class LightBoard
{
  private boolean[][] lights;
  public LightBoard(int numRows, int numCols){
    lights = new boolean[numRows][numCols];
    for(int r = 0; r < lights.length; r++){
      for(int c = 0; c < lights[numRows].length; c++){
        if(Math.random()*1 < 0.4){
          lights[r][c] = true;
        } else {
          lights[r][c] = false;
        }
      }
    }
  }

  public boolean evaluateLight(int row, int col)
  {
    int isOn = 0;
    for(int i = 0; i < lights.length; i++){
      if(lights[i][col] == true){
        isOn++;
      }
    }
    if(lights[row][col] == true && isOn%2 == 0){
      return false;
    } else if(lights[row][col] == false && isOn%3 == 0){
      return true;
    } else {
      return lights[row][col];
    }
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
