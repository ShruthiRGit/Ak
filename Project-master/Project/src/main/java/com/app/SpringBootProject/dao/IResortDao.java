package com.app.SpringBootProject.dao;

import java.util.List;

import com.app.SpringBootProject.bean.Resort;

/**
 * The Interface IResortDao.
 */
public interface IResortDao {

	/**
	 * Register resort.
	 *
	 * @param resort
	 *            the resort
	 * @param guestId
	 *            the guest id
	 * @return the resort
	 */
	public Resort registerResort(Resort resort, long guestId);

	/**
	 * Update resort.
	 *
	 * @param resort
	 *            the resort
	 * @param rReservationNumber
	 *            the r reservation number
	 * @return the long
	 */
	public long updateResort(Resort resort, long rReservationNumber);

	/**
	 * Gets the resort.
	 *
	 * @param rReservationNumber
	 *            the r reservation number
	 * @return the resort
	 */
	public Resort getResort(long rReservationNumber);

	/**
	 * Gets the all resort.
	 *
	 * @param guestId
	 *            the guest id
	 * @return the all resort
	 */
	public List<Resort> getAllResort(long guestId);

	/**
	 * Cancel resort.
	 *
	 * @param rReservationNumber
	 *            the r reservation number
	 * @return the long
	 */
	public long cancelResort(long rReservationNumber);

}
