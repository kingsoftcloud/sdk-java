package ksyun.client.knad.describeknadip.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKnadIpRequest
* @Description 请求参数
*/
@Data
public class DescribeKnadIpRequest{
    /**防护ip排序规则。
asc:升序；desc：降序
*/
    @KsYunField(name="IpSort")
    private String IpSort;

    /**状态排序规则。
asc:升序；desc：降序*/
    @KsYunField(name="IpStatusSort")
    private String IpStatusSort;

    /**防护能力排序规则。
 asc:升序；desc：降序*/
    @KsYunField(name="BandSort")
    private String BandSort;

    /**单个eip address*/
    @KsYunField(name="Ip")
    private String Ip;

    /**高防实例id*/
    @KsYunField(name="KnadId")
    private String KnadId;

    /**项目制id*/
    @KsYunField(name="ProjectId",type=2)
    private List<Integer> ProjectIdList;

    /**每页条数*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**开始条数*/
    @KsYunField(name="OffSet")
    private Integer OffSet;

}
