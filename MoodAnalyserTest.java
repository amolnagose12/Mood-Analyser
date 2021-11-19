package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	@Test
	public void given_SadMood_Should_Return_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzerMood("I am In a Sad Mood");
		Assert.assertEquals("SAD", mood);

	}

	@Test
	public void given_AnyMood_Should_Return_HAPPY() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyzerMood("I am in any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
}