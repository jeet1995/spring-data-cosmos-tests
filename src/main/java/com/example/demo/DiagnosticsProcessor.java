package com.example.demo;

import com.azure.spring.data.cosmos.core.ResponseDiagnostics;
import com.azure.spring.data.cosmos.core.ResponseDiagnosticsProcessor;

public class DiagnosticsProcessor implements ResponseDiagnosticsProcessor {
    @Override
    public void processResponseDiagnostics(ResponseDiagnostics responseDiagnostics) {}
}
