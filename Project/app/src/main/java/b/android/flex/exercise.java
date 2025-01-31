package b.android.flex;

//Exercise object just holds the relevent info of one exercise
public class exercise {
    String mExcersiseName;
    int mSetNumber;
    int mRepNumber;
    int mWeightNumber;
    int mEccentric;
    int mConcentric;
    int mRestTime;

    //was used as a placeholder when creating other features
    //so I might use this default constructer in the future
    exercise()
    {
        mExcersiseName = "default exercise";
        mSetNumber = 3;
        mRepNumber = 10;
        mWeightNumber = 135;
        mEccentric = 3;
        mConcentric = 3;
        mRestTime = 10;

    }

    exercise(String name, int sets, int reps, int weight, int eccentric, int concentric, int rest)
    {
        mExcersiseName = name;
        mSetNumber = sets;
        mRepNumber = reps;
        mWeightNumber = weight;
        mEccentric = eccentric;
        mConcentric = concentric;
        mRestTime = rest;

    }

    //get and set for weight which is pretty common in the app
    public int getmWeightNumber() {
        return mWeightNumber;
    }

    public void setmWeightNumber(int mWeightNumber) {
        this.mWeightNumber = mWeightNumber;
    }

}
