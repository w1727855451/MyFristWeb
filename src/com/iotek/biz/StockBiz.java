package com.iotek.biz;

import com.iotek.entry.Stock;

public interface StockBiz {
	public int  selectStock(int goodid);

	public boolean updateGoodCount(int num, int goodid);
}
