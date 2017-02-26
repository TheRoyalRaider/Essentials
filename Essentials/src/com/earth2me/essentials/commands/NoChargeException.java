package com.earth2me.essentials.commands;


@SuppressWarnings("serial")
public class NoChargeException extends Exception
{
	public NoChargeException()
	{
		super("Will charge later");
	}
}
