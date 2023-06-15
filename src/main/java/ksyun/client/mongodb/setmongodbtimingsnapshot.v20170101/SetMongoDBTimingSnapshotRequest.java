package ksyun.client.mongodb.setmongodbtimingsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetMongoDBTimingSnapshotRequest
* @Description 请求参数
*/
@Data
public class SetMongoDBTimingSnapshotRequest{
    /**实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**定时任务开关。定时任务开关On / Off当TimingSwitch=On时；Timezone与TimeCycle必填当TimingSwitch=Off时；Timezone与TimeCycle将被忽略。*/
    @KsYunField(name="TimingSwitch")
    private String TimingSwitch;

    /**备份的时间段。可选:00:00-01:00, 01:00-02:00, ..., 23:00-24:00等24个区间。*/
    @KsYunField(name="Timezone")
    private String Timezone;

    /**备份周期。每周选择哪几天备份，可以指定多个值。可选：Mon,Tues,Wed,Thur,Fri,Sat,Sun,Ever（以逗号间隔）。*/
    @KsYunField(name="TimeCycle")
    private String TimeCycle;


}