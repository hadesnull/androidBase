package com.example.qianfei.mybaseandroid.bean;

import java.util.List;

/**
 * Created by qf on 2018/11/16
 * 描述: CommBean
 */
public class CommBean {

    /**
     * code : 1
     * desc : 请求成功
     * results : {"contents":[{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.YearBonusCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/annualbonus_2-6.png","identity":"904684ae5b93422080002e92f26d19fb","iosLink":"SCYAnnualBonusCalculatorController","link":"/pafmodule/yearBonusCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/yearBonusCalculator?login=0","statId":"home_entry509","title":"年终奖计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.LoanCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/houseload_2_6.png","identity":"6a57d7b5ca9a4da88f5ff3b23a50b4a5","iosLink":"SCYMortgageCalculatorController","link":"/pafmodule/loanCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/loanCalculator?login=0","statId":"home_entry510","title":"房贷计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.PersonTaxCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/personaltax_2_6.png","identity":"6c440e3fb53e4909a3e8051075aeee79","iosLink":"SCYPersonalIncomeTaxController","link":"/pafmodule/personTaxCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/personTaxCalculator?login=0","statId":"home_entry512","title":"个税计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.NewHouseCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/newhouse_2_6.png","identity":"3e58de0b3d654413bbfeb3e7d4943531","iosLink":"SCYNewHouseTaxController","link":"/pafmodule/newHouseCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/newHouseCalculator?login=0","statId":"home_entry513","title":"新房计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.CarInsuranceActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/chexian_2_6.png","identity":"801a7b9e8f2f4495a357d27c05b95350","iosLink":"SCYCarInsuranceController","link":"/pafmodule/carInsurance?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/carInsurance?login=0","statId":"home_entry515","title":"车险计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.OldHouseCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/secondhousetax_2_6.png","identity":"3b91a81c91cc4db5b0761ca1385edc24","iosLink":"SCYSecondHandHouseTaxController","link":"/pafmodule/oldHouseCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/oldHouseCalculator?login=0","statId":"home_entry514","title":"二手房计算器"}],"groups":"index","locationKey":"index_calculator","title":"常用计算器"}
     */

    private int code;
    private String desc;
    private ResultsBean results;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ResultsBean getResults() {
        return results;
    }

    public void setResults(ResultsBean results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CommBean{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", results=" + results +
                '}';
    }

    public static class ResultsBean {
        /**
         * contents : [{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.YearBonusCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/annualbonus_2-6.png","identity":"904684ae5b93422080002e92f26d19fb","iosLink":"SCYAnnualBonusCalculatorController","link":"/pafmodule/yearBonusCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/yearBonusCalculator?login=0","statId":"home_entry509","title":"年终奖计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.LoanCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/houseload_2_6.png","identity":"6a57d7b5ca9a4da88f5ff3b23a50b4a5","iosLink":"SCYMortgageCalculatorController","link":"/pafmodule/loanCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/loanCalculator?login=0","statId":"home_entry510","title":"房贷计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.PersonTaxCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/personaltax_2_6.png","identity":"6c440e3fb53e4909a3e8051075aeee79","iosLink":"SCYPersonalIncomeTaxController","link":"/pafmodule/personTaxCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/personTaxCalculator?login=0","statId":"home_entry512","title":"个税计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.NewHouseCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/newhouse_2_6.png","identity":"3e58de0b3d654413bbfeb3e7d4943531","iosLink":"SCYNewHouseTaxController","link":"/pafmodule/newHouseCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/newHouseCalculator?login=0","statId":"home_entry513","title":"新房计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.CarInsuranceActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/chexian_2_6.png","identity":"801a7b9e8f2f4495a357d27c05b95350","iosLink":"SCYCarInsuranceController","link":"/pafmodule/carInsurance?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/carInsurance?login=0","statId":"home_entry515","title":"车险计算器"},{"androidLink":"intent:#Intent;component=pkg/com.caiyi.funds.OldHouseCalculatorActivity;end","icon":"http://gjj.youyuwo.com/image/home/index/allservices/secondhousetax_2_6.png","identity":"3b91a81c91cc4db5b0761ca1385edc24","iosLink":"SCYSecondHandHouseTaxController","link":"/pafmodule/oldHouseCalculator?login=0","linkType":1,"needLogin":0,"routeUrl":"/pafmodule/oldHouseCalculator?login=0","statId":"home_entry514","title":"二手房计算器"}]
         * groups : index
         * locationKey : index_calculator
         * title : 常用计算器
         */

        private String groups;
        private String locationKey;
        private String title;
        private List<ContentsBean> contents;

        public String getGroups() {
            return groups;
        }

        public void setGroups(String groups) {
            this.groups = groups;
        }

        public String getLocationKey() {
            return locationKey;
        }

        public void setLocationKey(String locationKey) {
            this.locationKey = locationKey;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<ContentsBean> getContents() {
            return contents;
        }

        public void setContents(List<ContentsBean> contents) {
            this.contents = contents;
        }

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "groups='" + groups + '\'' +
                    ", locationKey='" + locationKey + '\'' +
                    ", title='" + title + '\'' +
                    ", contents=" + contents +
                    '}';
        }

        public static class ContentsBean {
            /**
             * androidLink : intent:#Intent;component=pkg/com.caiyi.funds.YearBonusCalculatorActivity;end
             * icon : http://gjj.youyuwo.com/image/home/index/allservices/annualbonus_2-6.png
             * identity : 904684ae5b93422080002e92f26d19fb
             * iosLink : SCYAnnualBonusCalculatorController
             * link : /pafmodule/yearBonusCalculator?login=0
             * linkType : 1
             * needLogin : 0
             * routeUrl : /pafmodule/yearBonusCalculator?login=0
             * statId : home_entry509
             * title : 年终奖计算器
             */

            private String androidLink;
            private String icon;
            private String identity;
            private String iosLink;
            private String link;
            private int linkType;
            private int needLogin;
            private String routeUrl;
            private String statId;
            private String title;

            public String getAndroidLink() {
                return androidLink;
            }

            public void setAndroidLink(String androidLink) {
                this.androidLink = androidLink;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getIdentity() {
                return identity;
            }

            public void setIdentity(String identity) {
                this.identity = identity;
            }

            public String getIosLink() {
                return iosLink;
            }

            public void setIosLink(String iosLink) {
                this.iosLink = iosLink;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public int getLinkType() {
                return linkType;
            }

            public void setLinkType(int linkType) {
                this.linkType = linkType;
            }

            public int getNeedLogin() {
                return needLogin;
            }

            public void setNeedLogin(int needLogin) {
                this.needLogin = needLogin;
            }

            public String getRouteUrl() {
                return routeUrl;
            }

            public void setRouteUrl(String routeUrl) {
                this.routeUrl = routeUrl;
            }

            public String getStatId() {
                return statId;
            }

            public void setStatId(String statId) {
                this.statId = statId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            @Override
            public String toString() {
                return "ContentsBean{" +
                        "androidLink='" + androidLink + '\'' +
                        ", icon='" + icon + '\'' +
                        ", identity='" + identity + '\'' +
                        ", iosLink='" + iosLink + '\'' +
                        ", link='" + link + '\'' +
                        ", linkType=" + linkType +
                        ", needLogin=" + needLogin +
                        ", routeUrl='" + routeUrl + '\'' +
                        ", statId='" + statId + '\'' +
                        ", title='" + title + '\'' +
                        '}';
            }
        }
    }
}
