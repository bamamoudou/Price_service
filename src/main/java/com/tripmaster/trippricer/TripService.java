package com.tripmaster.trippricer;

import java.util.List;

import com.tripmaster.common.AttractionNearby;
import com.tripmaster.common.ProviderData;
import com.tripmaster.common.User;

public interface TripService {
	final static String TRIP_PRICER_KEY = "test-server-api-key";

	List<ProviderData> calculateProposals(User user, List<AttractionNearby> attractions, int cumulativeRewardPoints);
}