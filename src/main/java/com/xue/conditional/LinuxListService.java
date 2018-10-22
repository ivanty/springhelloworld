package com.xue.conditional;

public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }
}
