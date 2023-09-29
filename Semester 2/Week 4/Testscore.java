public class Testscore
{
	private int score1;
	private int score2;
	private int score3;

	public void setTestscore(int score11, int score22, int score33)
	{
		score1 = score11;
		score2 = score22;
		score3 = score33;
	}
	public double getAverage()
	{
		return ((score1 + score2 + score3)/3);
	}

}
