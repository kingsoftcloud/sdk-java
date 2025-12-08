package ksyun.client.krds.describecollations.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCollationsResponse
* @Description DescribeCollations 返回体
*/
@Data
@ToString
public class DescribeCollationsResponse extends BaseResponseModel {
    /**字符集列表	
–*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**字符集列表	
–*/
        @JsonProperty("Collations")
        private CollationsDto Collations;

        @Data
        @ToString
        public static class CollationsDto {
            /***/
            @JsonProperty("utf8")
            private List<String> Utf8;

            /***/
            @JsonProperty("gbk")
            private List<String> Gbk;

            /***/
            @JsonProperty("latin1")
            private List<String> Latin1;

            /***/
            @JsonProperty("utf8mb4")
            private List<String> Utf8mb4;

            /***/
            @JsonProperty("gb18030")
            private List<String> Gb18030;

            /***/
            @JsonProperty("koi8u")
            private List<String> Koi8u;

            /***/
            @JsonProperty("koi8r")
            private List<String> Koi8r;

            /***/
            @JsonProperty("cp850")
            private List<String> Cp850;

            /***/
            @JsonProperty("macce")
            private List<String> Macce;

            /***/
            @JsonProperty("ujis")
            private List<String> Ujis;

            /***/
            @JsonProperty("hebrew")
            private List<String> Hebrew;

            /***/
            @JsonProperty("cp932")
            private List<String> Cp932;

            /***/
            @JsonProperty("ascii")
            private List<String> Ascii;

            /***/
            @JsonProperty("binary")
            private List<String> Binary;

            /***/
            @JsonProperty("sjis")
            private List<String> Sjis;

            /***/
            @JsonProperty("armscii8")
            private List<String> Armscii8;

            /***/
            @JsonProperty("cp852")
            private List<String> Cp852;

            /***/
            @JsonProperty("keybcs2")
            private List<String> Keybcs2;

            /***/
            @JsonProperty("cp866")
            private List<String> Cp866;

            /***/
            @JsonProperty("geostd8")
            private List<String> Geostd8;

            /***/
            @JsonProperty("cp1257")
            private List<String> Cp1257;

            /***/
            @JsonProperty("ucs2")
            private List<String> Ucs2;

            /***/
            @JsonProperty("dec8")
            private List<String> Dec8;

            /***/
            @JsonProperty("cp1250")
            private List<String> Cp1250;

            /***/
            @JsonProperty("tis620")
            private List<String> Tis620;

            /***/
            @JsonProperty("utf32")
            private List<String> Utf32;

            /***/
            @JsonProperty("latin5")
            private List<String> Latin5;

            /***/
            @JsonProperty("hp8")
            private List<String> Hp8;

            /***/
            @JsonProperty("utf16le")
            private List<String> Utf16le;

            /***/
            @JsonProperty("latin2")
            private List<String> Latin2;

            /***/
            @JsonProperty("macroman")
            private List<String> Macroman;

            /***/
            @JsonProperty("eucjpms")
            private List<String> Eucjpms;

            /***/
            @JsonProperty("gb2312")
            private List<String> Gb2312;

            /***/
            @JsonProperty("cp1256")
            private List<String> Cp1256;

            /***/
            @JsonProperty("big5")
            private List<String> Big5;

            /***/
            @JsonProperty("greek")
            private List<String> Greek;

            /***/
            @JsonProperty("euckr")
            private List<String> Euckr;

            /***/
            @JsonProperty("cp1251")
            private List<String> Cp1251;

            /***/
            @JsonProperty("utf16")
            private List<String> Utf16;

            /***/
            @JsonProperty("swe7")
            private List<String> Swe7;

            /***/
            @JsonProperty("latin7")
            private List<String> Latin7;

        }

    }

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
