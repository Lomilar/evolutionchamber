package com.fray.evo.action.upgrade;

import com.fray.evo.util.ZergUpgradeLibrary;

public final class EcActionUpgradeCarapace2 extends EcActionUpgrade
{
	private static final long serialVersionUID = 1L;

	@Override
	public void init()
	{
		init(ZergUpgradeLibrary.Armor2);
	}
}