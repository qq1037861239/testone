package com.demo.pojo.isbn;

import java.util.Objects;

/**
 * @author 10378
 * @title: ISBN
 * @projectName testone
 * @description: TODO
 * @date 2019/6/91:17
 */
public final class ISBN {

    private Integer frontNum = null;

    private Integer areaNum = null;

    private Integer publisherNum = null;

    private Integer bookOrderNum = null;

    private Integer checkCodeNum = null;

    public ISBN() {
    }

    public ISBN(String isbnCode) {

    }

    public ISBN(Integer frontNum, Integer areaNum, Integer publisherNum,
                Integer bookOrderNum, Integer checkCodeNum) {
        this.frontNum = frontNum;
        this.areaNum = areaNum;
        this.publisherNum = publisherNum;
        this.bookOrderNum = bookOrderNum;
        this.checkCodeNum = checkCodeNum;
    }

    //判断一个0-9的基数是不是偶数，若是返回true，否则返回false;
    private static boolean isEven(int base) {
        return (base & 1) != 1;
    }

    //判断一个0-9的基数是不是奇数，若是返回true，否则返回false;
    private static boolean isOdd(int base) {
        return (base & 1) == 1;
    }

    public static Integer computeCheckCodeNum(ISBN isbn) {
        if (isbn.frontNum != null && isbn.areaNum != null &&
            isbn.publisherNum != null && isbn.bookOrderNum != null) {

            String[] bases = isbn.toNumStr().split("");

            int sum = 0;

            for (int i = 1; i <= bases.length; i++) {
                int eachInt = Integer.parseInt(bases[i - 1]);
                sum += isOdd(i) ? eachInt : eachInt * 3;
            }

            return (10 - (sum % 10)) % 10;
        }
        return null;
    }

    public static boolean checkingCheckCodeNum(ISBN isbn) {
        if (isbn.checkCodeNum != null) {
            return isbn.checkCodeNum.equals(computeCheckCodeNum(isbn));
        } else {
            return false;
        }
    }

    public Integer getFrontNum() {
        return frontNum;
    }

    public void setFrontNum(Integer frontNum) {
        this.frontNum = frontNum;
    }

    public Integer getareaNum() {
        return areaNum;
    }

    public void setareaNum(Integer areaNum) {
        this.areaNum = areaNum;
    }

    public Integer getPublisherNum() {
        return publisherNum;
    }

    public void setPublisherNum(Integer publisherNum) {
        this.publisherNum = publisherNum;
    }

    public Integer getBookOrderNum() {
        return bookOrderNum;
    }

    public void setBookOrderNum(Integer bookOrderNum) {
        this.bookOrderNum = bookOrderNum;
    }

    public Integer getCheckCodeNum() {
        return checkCodeNum;
    }

    public void setCheckCodeNum(Integer checkCodeNum) {
        this.checkCodeNum = checkCodeNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ISBN isbn = (ISBN) o;
        return Objects.equals(getFrontNum(), isbn.getFrontNum()) &&
                Objects.equals(getareaNum(), isbn.getareaNum()) &&
                Objects.equals(getPublisherNum(), isbn.getPublisherNum()) &&
                Objects.equals(getBookOrderNum(), isbn.getBookOrderNum()) &&
                Objects.equals(getCheckCodeNum(), isbn.getCheckCodeNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrontNum(), getareaNum(), getPublisherNum(),
                            getBookOrderNum(), getCheckCodeNum());
    }

    @Override
    public String toString() {
        return "ISBN " + frontNum + '-' + areaNum + '-' + publisherNum + '-'
                + bookOrderNum + '-' + checkCodeNum;
    }

    public String toNumStr() {
        return "" + frontNum + areaNum + publisherNum + bookOrderNum;
    }
}
