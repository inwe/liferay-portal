/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Region service. Represents a row in the &quot;Region&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.RegionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. All helper methods and application logic should be put in {@link com.liferay.portal.model.impl.RegionImpl}.
 * </p>
 *
 * <p>
 * Never reference this interface directly. All methods that expect a  region model instance should use the {@link Region} interface instead.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Region
 * @see       com.liferay.portal.model.impl.RegionImpl
 * @see       com.liferay.portal.model.impl.RegionModelImpl
 * @generated
 */
public interface RegionModel extends BaseModel<Region> {
	/**
	 * Gets the primary key of this  region.
	 *
	 * @return the primary key of this  region
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this  region
	 *
	 * @param pk the primary key of this  region
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the region id of this  region.
	 *
	 * @return the region id of this  region
	 */
	public long getRegionId();

	/**
	 * Sets the region id of this  region.
	 *
	 * @param regionId the region id of this  region
	 */
	public void setRegionId(long regionId);

	/**
	 * Gets the country id of this  region.
	 *
	 * @return the country id of this  region
	 */
	public long getCountryId();

	/**
	 * Sets the country id of this  region.
	 *
	 * @param countryId the country id of this  region
	 */
	public void setCountryId(long countryId);

	/**
	 * Gets the region code of this  region.
	 *
	 * @return the region code of this  region
	 */
	@AutoEscape
	public String getRegionCode();

	/**
	 * Sets the region code of this  region.
	 *
	 * @param regionCode the region code of this  region
	 */
	public void setRegionCode(String regionCode);

	/**
	 * Gets the name of this  region.
	 *
	 * @return the name of this  region
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this  region.
	 *
	 * @param name the name of this  region
	 */
	public void setName(String name);

	/**
	 * Gets the active of this  region.
	 *
	 * @return the active of this  region
	 */
	public boolean getActive();

	/**
	 * Determines whether this  region is active.
	 *
	 * @return whether this  region is active
	 */
	public boolean isActive();

	/**
	 * Sets the active of this  region.
	 *
	 * @param active the active of this  region
	 */
	public void setActive(boolean active);

	/**
	 * Gets a copy of this  region as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public Region toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Region region);

	public int hashCode();

	public String toString();

	public String toXmlString();
}