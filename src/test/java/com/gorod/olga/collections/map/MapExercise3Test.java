package com.gorod.olga.collections.map;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapExercise3Test {

    @Test
    public void emptyString() {
        String word = "";
        String encodedWord = "";
        String wordToEncode = "";
        String encodeResult = "";
        String wordToDecode = "";
        String decodeResult = "";
        MapExercise3.SubstitutionCipher cipher = new MapExercise3.SubstitutionCipher(word, encodedWord);
        Assert.assertEquals(encodeResult, cipher.encode(wordToEncode));
        Assert.assertEquals(decodeResult, cipher.decode(wordToDecode));
    }

    @Test
    public void severalWords() {
        String word = "abcd";
        String encodedWord = "*d%#";
        String wordToEncode = "abacabadaba";
        String encodeResult = "*d*%*d*#*d*";

        String wordToDecode = "#*%*d*%";
        String decodeResult = "dacabac";
        MapExercise3.SubstitutionCipher cipher = new MapExercise3.SubstitutionCipher(word, encodedWord);
        Assert.assertEquals(encodeResult, cipher.encode(wordToEncode));
        Assert.assertEquals(decodeResult, cipher.decode(wordToDecode));
    }

}