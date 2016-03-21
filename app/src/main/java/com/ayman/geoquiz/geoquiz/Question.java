package com.ayman.geoquiz.geoquiz;

/**
 * Created by Ayman on 2/14/2016.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textREstID, boolean mAnswerTrue) {
        mTextResId = textREstID;
        mAnswerTrue = mAnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


}