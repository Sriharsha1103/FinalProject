package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.test.mock.MockContext;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.assertTrue;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest extends AndroidTestCase {

    private Context context;
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void endpointAsyncTaskTest() throws InterruptedException, ExecutionException, TimeoutException {
        String joke;
        context = InstrumentationRegistry.getTargetContext();

        joke = new EndpointAsyncTask().execute(context).get();
        Assert.assertNotNull(joke);
        Assert.assertTrue(joke.length()>0);
    }
}
