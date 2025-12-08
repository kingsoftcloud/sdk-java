package ksyun.client.kci.describekcipackages.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKciPackagesResponse
* @Description DescribeKciPackages 返回体
*/
@Data
@ToString
public class DescribeKciPackagesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Packages")
    private List<PackagesDto> Packages;

    @Data
    @ToString
    public static class PackagesDto {
        /**CPU核数*/
        @JsonProperty("Cpu")
        private Double Cpu;

        /**内存，单位GB*/
        @JsonProperty("Mem")
        private List<Double> Mem;

    }

}
