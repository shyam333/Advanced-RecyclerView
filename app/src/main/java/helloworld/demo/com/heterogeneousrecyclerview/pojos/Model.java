package helloworld.demo.com.heterogeneousrecyclerview.pojos;

import java.util.List;

/**
 * Created by shyamramesh on 14/03/18.
 */

public class Model {

    private String Text1;
    private String Text2;
    private List<String> MultipleText;
    private String[] array;
   // private Boolean checkSingleLine = null;
   // private Boolean checkMultiLine = null;
   // private String TAG1 = "single line";
  //  private String TAG2 = "multi line";

    private String tag;




//    public Boolean getCheckMultiLine() {
//        return checkMultiLine;
//    }
//
//    public void setCheckMultiLine(Boolean checkMultiLine) {
//        this.checkMultiLine = checkMultiLine;
//    }

    public Model() {

    }
    public String getText1() {
        return Text1;
    }
    public void setText1(String text1) {
        Text1 = text1;
    }
    public String getText2() {
        return Text2;
    }
    public void setText2(String text2) {
        Text2 = text2;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

//    public void setText(String[] text) {
//        this.text = text;
//    }

//    public String[] getArray() {
//        return array;
//    }
//
//    public void setArray(String[] array) {
//        this.array = array;
//    }

    public void setMultipleList(List<String> MultipleText) {
        this.MultipleText = MultipleText;
    }

    public List<String> getMultipleList() {
        return MultipleText;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }
//    public void setMultipleText(String multipleText) {
//        this.multipleText = multipleText;
//    }
//public String IfSingleline()
//{
//    return TAG1;
//}
//
//    public void setTag(Boolean txt1)
//    {
//        TAG1 = txt1;
//    }
//
//    public void setTag(Boolean txt2)
//    {
//        TAG2 = txt2;
//    }
//    public Boolean IfSingleLine()
//    {
//        return checkSingleLine;
//    }

//    public Boolean IfMultiLine()
//    {
//        return checkMultiLine;
//    }

//    public void settingSingleLineText(Boolean txt1)
//    {
//        checkSingleLine = txt1;
//    }
//
//
//
//    public void settingMultiLineText(Boolean txt2)
//    {
//        checkMultiLine = txt2;
//    }
}
