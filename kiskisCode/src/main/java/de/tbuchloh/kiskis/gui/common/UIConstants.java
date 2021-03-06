/*
 * Copyright (C) 2004 by Tobias Buchloh.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this program; if not, write to the Free
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * If you didn't download this code from the following link, you should check if
 * you aren't using an obsolete version:
 * http://www.sourceforge.net/projects/kiskis
 */

package de.tbuchloh.kiskis.gui.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <b>UIConstants</b>:
 * 
 * @author gandalf
 * @version $Id$
 */
public interface UIConstants {

	public static final Date END = new GregorianCalendar(2100, 12, 31)
			.getTime();

	public static final DateFormat LONG_DATE = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public static final DateFormat SHORT_DATE = new SimpleDateFormat(
			"yyyy-MM-dd");

	public static final Date START = new GregorianCalendar(0, 0, 0).getTime();

}
