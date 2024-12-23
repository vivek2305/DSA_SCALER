package lld_assignment.streams;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SentenceProcessorFlatMap {
    public static long processSentences(List<String> sentences) {
        //code here

        int avg=0;
        List<String> wrodList = sentences.stream().filter(x->!x.contains("Java")).toList();
        for (String s:wrodList){
            System.out.println(s);
        }

        List<String> wordsList= wrodList.stream().map(x-> x.split(" ")).flatMap(Arrays::stream).map(String::trim).distinct().toList();

        for (String s:wordsList){
            System.out.println(s);
        }

        return wordsList.size();
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Python is a programming language.",
                "JavaScript is used for web development.",
                "Ruby is known for its simplicity."
        );

        long averageLength = SentenceProcessorFlatMap.processSentences(sentences);
        System.out.println(averageLength);

//        sentences = Arrays.asList(
//                "Python is a programming language.",
//                "JS is used for web development.",
//                "Ruby is known for its simplicity.",
//                "java is good"
//        );
//
//        averageLength= SentenceProcessorFlatMap.processSentences(sentences);
//        System.out.println(averageLength);
    }
}