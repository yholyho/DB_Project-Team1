package ReviewAndRatings.ReviewDB;

import java.time.LocalDateTime;

// 코멘트 Class
public class ReviewInput {

	private String review;
	private Double rating;
	private int bundleId;
	private int depth;
	private int bpmId;
	public ReviewInput(String review, Double rating, int bundleId, int depth, int bpmId){
		super();
		this.review = review;
		this.rating = rating;
		this.bundleId = bundleId;
		this.depth = depth;
		this.bpmId = bpmId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public int getBundleId() {
		return bundleId;
	}
	public void setBundleId(int bundleId) {
		this.bundleId = bundleId;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getBpmId() {
		return bpmId;
	}
	public void setBpmId(int bpmId) {
		this.bpmId = bpmId;
	}
	@Override
	public String toString() {
		return "ReviewInput [reviewId=" + ", review=" + review + ", rating=" + rating + ", bundleId="
				+ bundleId + ", depth=" + depth + ", bpmId=" + bpmId + ", writingTime=" +"]";
	}
	
	
	
}
