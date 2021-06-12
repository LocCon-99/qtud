package qtud.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the MM_MEETING database table.
 * 
 */
@Entity
@Table(name="MM_MEETING")
@NamedQuery(name="MmMeeting.findAll", query="SELECT m FROM MmMeeting m")
public class MmMeeting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="MEETING_ID")
	private String meetingId;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="CREATOR_ID")
	private String creatorId;

	private String description;

	@Column(name="END_TIME")
	private Timestamp endTime;

	@Column(name="GROUP_ID")
	private String groupId;

	private Long important;

	@Column(name="IS_COM_SCHEDULE")
	private Long isComSchedule;

	@Column(name="MAIN_MEETING")
	private Long mainMeeting;

	@Column(name="MEETING_COMMENT")
	private String meetingComment;

	@Column(name="MEETING_SCOPE")
	private Long meetingScope;

	@Column(name="NEED_TELECONFERENCE")
	private Long needTeleconference;

	@Column(name="OTHER_PARTICIPANT")
	private String otherParticipant;

	@Column(name="OTHER_PRESIDENT")
	private String otherPresident;

	@Column(name="OTHER_ROOMS")
	private String otherRooms;

	@Column(name="OTHER_SUPPORTER")
	private String otherSupporter;

	@Column(name="PARENT_ID")
	private Long parentId;

	@Column(name="PRE_MEETING_TASK")
	private String preMeetingTask;

	@Column(name="RECUR_END_DATE")
	private Timestamp recurEndDate;

	@Column(name="RECUR_START_DATE")
	private Timestamp recurStartDate;

	private Long recurrence;

	@Column(name="ROOM_ID")
	private String roomId;

	@Column(name="START_TIME")
	private Timestamp startTime;

	private Integer status;

	private String subject;

	public MmMeeting() {
	}

	public String getMeetingId() {
		return this.meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getImportant() {
		return this.important;
	}

	public void setImportant(Long important) {
		this.important = important;
	}

	public Long getIsComSchedule() {
		return this.isComSchedule;
	}

	public void setIsComSchedule(Long isComSchedule) {
		this.isComSchedule = isComSchedule;
	}

	public Long getMainMeeting() {
		return this.mainMeeting;
	}

	public void setMainMeeting(Long mainMeeting) {
		this.mainMeeting = mainMeeting;
	}

	public String getMeetingComment() {
		return this.meetingComment;
	}

	public void setMeetingComment(String meetingComment) {
		this.meetingComment = meetingComment;
	}

	public Long getMeetingScope() {
		return this.meetingScope;
	}

	public void setMeetingScope(Long meetingScope) {
		this.meetingScope = meetingScope;
	}

	public Long getNeedTeleconference() {
		return this.needTeleconference;
	}

	public void setNeedTeleconference(Long needTeleconference) {
		this.needTeleconference = needTeleconference;
	}

	public String getOtherParticipant() {
		return this.otherParticipant;
	}

	public void setOtherParticipant(String otherParticipant) {
		this.otherParticipant = otherParticipant;
	}

	public String getOtherPresident() {
		return this.otherPresident;
	}

	public void setOtherPresident(String otherPresident) {
		this.otherPresident = otherPresident;
	}

	public String getOtherRooms() {
		return this.otherRooms;
	}

	public void setOtherRooms(String otherRooms) {
		this.otherRooms = otherRooms;
	}

	public String getOtherSupporter() {
		return this.otherSupporter;
	}

	public void setOtherSupporter(String otherSupporter) {
		this.otherSupporter = otherSupporter;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getPreMeetingTask() {
		return this.preMeetingTask;
	}

	public void setPreMeetingTask(String preMeetingTask) {
		this.preMeetingTask = preMeetingTask;
	}

	public Timestamp getRecurEndDate() {
		return this.recurEndDate;
	}

	public void setRecurEndDate(Timestamp recurEndDate) {
		this.recurEndDate = recurEndDate;
	}

	public Timestamp getRecurStartDate() {
		return this.recurStartDate;
	}

	public void setRecurStartDate(Timestamp recurStartDate) {
		this.recurStartDate = recurStartDate;
	}

	public Long getRecurrence() {
		return this.recurrence;
	}

	public void setRecurrence(Long recurrence) {
		this.recurrence = recurrence;
	}

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}