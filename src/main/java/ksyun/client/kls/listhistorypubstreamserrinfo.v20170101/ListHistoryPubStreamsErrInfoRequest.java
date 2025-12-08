package ksyun.client.kls.listhistorypubstreamserrinfo.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListHistoryPubStreamsErrInfoRequest
* @Description 请求参数
*/
@Data
public class ListHistoryPubStreamsErrInfoRequest{
    /**域名空间*/
    @KsYunField(name="UniqueName")
    private String UniqueName;

    /**应用名*/
    @KsYunField(name="App")
    private String App;

    /**推流域名*/
    @KsYunField(name="Pubdomain")
    private String Pubdomain;

    /**流名*/
    @KsYunField(name="Stream")
    private String Stream;

    /**排序类型（0：按推流开始的时间降序排列，1：按推流开始的时间升序排列），默认为0*/
    @KsYunField(name="OrderTime")
    private Integer OrderTime;

    /**起始游标，默认为0。0代表第1页的数据，以此类推*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页返回的记录数，默认1000。单页最多返回5000条数据*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**开始时间，UTC时间戳；默认5天前的0点，开始和结束时间间隔不能超过5天，支持查28天内的数据*/
    @KsYunField(name="StartUnixTime")
    private Integer StartUnixTime;

    /**结束时间，UTC时间戳；默认当前时间，开始和结束时间间隔不能超过5天，支持查28天内的数据*/
    @KsYunField(name="EndUnixTime")
    private Integer EndUnixTime;

}
