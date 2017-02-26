package com.earth2me.essentials.api;

import static com.earth2me.essentials.I18n.tl;


@SuppressWarnings("serial")
public class UserDoesNotExistException extends Exception
{
	public UserDoesNotExistException(String name)
	{
		super(tl("userDoesNotExist", name));
	}
}
