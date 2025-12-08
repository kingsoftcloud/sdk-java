package ksyun.client.ket.startloop.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartLoopRequest
* @Description 请求参数
*/
@Data
public class StartLoopRequest{
    /**域名空间*/
    @KsYunField(name="UniqName")
    private String UniqName;

    /**应用名*/
    @KsYunField(name="App")
    private String App;

    /**模板名称，支持配置：视频帧率、视频码率、音频码率、视频分辨率*/
    @KsYunField(name="Preset")
    private String Preset;

    /**轮播流名*/
    @KsYunField(name="StreamID")
    private String StreamID;

    /**轮播源文件信息，数组，每项包括文件路径（金山云KS3内网URL）和顺序参数。发起轮播前请先确认轮播源文件是否存在。最多可以支持100个轮播任务。*/
    @KsYunField(name="SrcInfo",type=2)
    private List<SrcInfoDto1> SrcInfoList;

    @Data
    @ToString
    public static class SrcInfoDto1 {
        /**源文件在ks3的完整路径*/
        @KsYunField(name="Path")
        private String Path;

        /**文件播放顺序*/
        @KsYunField(name="Index")
        private Integer Index;

    }

    /**用来轮播的推流域名*/
    @KsYunField(name="PubDomain")
    private String PubDomain;

    /**任务开始时间戳，指定轮播流启动播放时间，精确到秒，不填默认下发后立即开始轮播。只能填当前时间1分钟之后的时间。*/
    @KsYunField(name="TaskStartTime")
    private String TaskStartTime;

    /**任务结束时间戳，指定轮播流结束播放时间，精确到秒，不填默认结束时间为开始时间之后20天。TaskStopTime-TaskStartTime必须>30s。*/
    @KsYunField(name="TaskStopTime")
    private String TaskStopTime;

    /**文件轮播次数，与TaskStopTime冲突时，以TaskStopTime为准，如果需要以轮播次数为准，TaskStopTime不填。*/
    @KsYunField(name="LoopTimes")
    private Integer LoopTimes;

}
