package cn.bdqn.util;

/**
 * 分页工具类
 */
public class PageUtil {
	private Integer pageIndex = 1; // 当前页
	private Integer pageSize = 3; // 页大小
	private Integer pageCount = 1; // 总页数
	private Integer totalCount = 0; // 总记录数
	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getTotalCount() {
		return totalCount;
	}



	public void setTotalCount(Integer totalCount) {
		if (totalCount > 0) {
			this.totalCount = totalCount;
			this.pageCount = (totalCount % pageSize == 0) ? (totalCount / pageSize)
					: (totalCount / pageSize + 1);
		}
	}

	public PageUtil(Integer pageIndex, Integer pageSize, Integer pageCount,
			Integer totalCount) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.pageCount = pageCount;
		this.totalCount = totalCount;
	}

	public PageUtil() {
		super();
	}

	@Override
	public String toString() {
		return "PageUtil [pageIndex=" + pageIndex + ", pageSize=" + pageSize
				+ ", pageCount=" + pageCount + ", totalCount=" + totalCount
				+ "]";
	}

}
