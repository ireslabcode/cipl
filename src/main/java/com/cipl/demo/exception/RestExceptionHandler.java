/*
 * package com.cipl.demo.exception;
 * 
 * import org.springframework.core.Ordered; import
 * org.springframework.core.annotation.Order; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.context.request.WebRequest; import
 * org.springframework.web.servlet.mvc.method.annotation.
 * ResponseEntityExceptionHandler;
 * 
 * import com.cipl.demo.model.UserResponse;
 * 
 * @Order(Ordered.HIGHEST_PRECEDENCE)
 * 
 * @ControllerAdvice public class RestExceptionHandler extends
 * ResponseEntityExceptionHandler {
 * 
 * 
 * @ExceptionHandler(Exception.class) public ResponseEntity<Object>
 * defaultErrorHandler(WebRequest req, Exception ex) {
 * 
 * ex.printStackTrace();
 * 
 * 
 * UserResponse response = new UserResponse();
 * 
 * ResponseDto responseDto = new
 * ResponseDto(ResponseCodes.FAILURE_RESPONSE_CODE.getResponseCode(),
 * ex.getLocalizedMessage());
 * leaveModuleBaseRespone.setResponseDto(responseDto); return
 * handleExceptionInternal(ex, leaveModuleBaseRespone, new HttpHeaders(),
 * HttpStatus.CONFLICT, req); }
 * 
 * @ExceptionHandler({ IllegalArgumentException.class,
 * IllegalStateException.class }) public ResponseEntity<Object>
 * handleConflict(RuntimeException ex, WebRequest request) {
 * 
 * LeaveModuleBaseResponse<LeaveApplicationDTO> leaveModuleBaseRespone = new
 * LeaveModuleBaseResponse<LeaveApplicationDTO>();
 * 
 * ResponseDto responseDto = new
 * ResponseDto(ResponseCodes.FAILURE_RESPONSE_CODE.getResponseCode(),
 * ex.getLocalizedMessage());
 * leaveModuleBaseRespone.setResponseDto(responseDto); return
 * handleExceptionInternal(ex, leaveModuleBaseRespone, new HttpHeaders(),
 * HttpStatus.CONFLICT, request);
 * 
 * }
 * 
 * }
 */