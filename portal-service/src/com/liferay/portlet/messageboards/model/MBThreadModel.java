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

package com.liferay.portlet.messageboards.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MBThread service. Represents a row in the &quot;MBThread&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.messageboards.model.impl.MBThreadModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. All helper methods and application logic should be put in {@link com.liferay.portlet.messageboards.model.impl.MBThreadImpl}.
 * </p>
 *
 * <p>
 * Never reference this interface directly. All methods that expect a  m b thread model instance should use the {@link MBThread} interface instead.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MBThread
 * @see       com.liferay.portlet.messageboards.model.impl.MBThreadImpl
 * @see       com.liferay.portlet.messageboards.model.impl.MBThreadModelImpl
 * @generated
 */
public interface MBThreadModel extends BaseModel<MBThread> {
	/**
	 * Gets the primary key of this  m b thread.
	 *
	 * @return the primary key of this  m b thread
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this  m b thread
	 *
	 * @param pk the primary key of this  m b thread
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the thread id of this  m b thread.
	 *
	 * @return the thread id of this  m b thread
	 */
	public long getThreadId();

	/**
	 * Sets the thread id of this  m b thread.
	 *
	 * @param threadId the thread id of this  m b thread
	 */
	public void setThreadId(long threadId);

	/**
	 * Gets the group id of this  m b thread.
	 *
	 * @return the group id of this  m b thread
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this  m b thread.
	 *
	 * @param groupId the group id of this  m b thread
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the category id of this  m b thread.
	 *
	 * @return the category id of this  m b thread
	 */
	public long getCategoryId();

	/**
	 * Sets the category id of this  m b thread.
	 *
	 * @param categoryId the category id of this  m b thread
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Gets the root message id of this  m b thread.
	 *
	 * @return the root message id of this  m b thread
	 */
	public long getRootMessageId();

	/**
	 * Sets the root message id of this  m b thread.
	 *
	 * @param rootMessageId the root message id of this  m b thread
	 */
	public void setRootMessageId(long rootMessageId);

	/**
	 * Gets the message count of this  m b thread.
	 *
	 * @return the message count of this  m b thread
	 */
	public int getMessageCount();

	/**
	 * Sets the message count of this  m b thread.
	 *
	 * @param messageCount the message count of this  m b thread
	 */
	public void setMessageCount(int messageCount);

	/**
	 * Gets the view count of this  m b thread.
	 *
	 * @return the view count of this  m b thread
	 */
	public int getViewCount();

	/**
	 * Sets the view count of this  m b thread.
	 *
	 * @param viewCount the view count of this  m b thread
	 */
	public void setViewCount(int viewCount);

	/**
	 * Gets the last post by user id of this  m b thread.
	 *
	 * @return the last post by user id of this  m b thread
	 */
	public long getLastPostByUserId();

	/**
	 * Sets the last post by user id of this  m b thread.
	 *
	 * @param lastPostByUserId the last post by user id of this  m b thread
	 */
	public void setLastPostByUserId(long lastPostByUserId);

	/**
	 * Gets the last post by user uuid of this  m b thread.
	 *
	 * @return the last post by user uuid of this  m b thread
	 * @throws SystemException if a system exception occurred
	 */
	public String getLastPostByUserUuid() throws SystemException;

	/**
	 * Sets the last post by user uuid of this  m b thread.
	 *
	 * @param lastPostByUserUuid the last post by user uuid of this  m b thread
	 */
	public void setLastPostByUserUuid(String lastPostByUserUuid);

	/**
	 * Gets the last post date of this  m b thread.
	 *
	 * @return the last post date of this  m b thread
	 */
	public Date getLastPostDate();

	/**
	 * Sets the last post date of this  m b thread.
	 *
	 * @param lastPostDate the last post date of this  m b thread
	 */
	public void setLastPostDate(Date lastPostDate);

	/**
	 * Gets the priority of this  m b thread.
	 *
	 * @return the priority of this  m b thread
	 */
	public double getPriority();

	/**
	 * Sets the priority of this  m b thread.
	 *
	 * @param priority the priority of this  m b thread
	 */
	public void setPriority(double priority);

	/**
	 * Gets the status of this  m b thread.
	 *
	 * @return the status of this  m b thread
	 */
	public int getStatus();

	/**
	 * Sets the status of this  m b thread.
	 *
	 * @param status the status of this  m b thread
	 */
	public void setStatus(int status);

	/**
	 * Gets the status by user id of this  m b thread.
	 *
	 * @return the status by user id of this  m b thread
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user id of this  m b thread.
	 *
	 * @param statusByUserId the status by user id of this  m b thread
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Gets the status by user uuid of this  m b thread.
	 *
	 * @return the status by user uuid of this  m b thread
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this  m b thread.
	 *
	 * @param statusByUserUuid the status by user uuid of this  m b thread
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Gets the status by user name of this  m b thread.
	 *
	 * @return the status by user name of this  m b thread
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this  m b thread.
	 *
	 * @param statusByUserName the status by user name of this  m b thread
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Gets the status date of this  m b thread.
	 *
	 * @return the status date of this  m b thread
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this  m b thread.
	 *
	 * @param statusDate the status date of this  m b thread
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * Determines whether this  m b thread is approved.
	 *
	 * @return true if this  m b thread is approved; false otherwise
	 */
	public boolean isApproved();

	/**
	 * Determines whether this  m b thread is a draft.
	 *
	 * @return true if this  m b thread is a draft; false otherwise
	 */
	public boolean isDraft();

	/**
	 * Determines whether this  m b thread is expired.
	 *
	 * @return true if this  m b thread is expired; false otherwise
	 */
	public boolean isExpired();

	/**
	 * Determines whether this  m b thread is pending.
	 *
	 * @return true if this  m b thread is pending; false otherwise
	 */
	public boolean isPending();

	/**
	 * Gets a copy of this  m b thread as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public MBThread toEscapedModel();

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

	public int compareTo(MBThread mbThread);

	public int hashCode();

	public String toString();

	public String toXmlString();
}