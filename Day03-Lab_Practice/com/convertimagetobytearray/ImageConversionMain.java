package com.convertimagetobytearray;

// Class to execute the image conversion and verification process
public class ImageConversionMain {
	public static void main(String[] args) {
		// Define the input image file path
		String inputImagePath = "temporaryImage.JPG";

		// Define the output image file path
		String outputImagePath = "temporaryImage.JPG";

		// Convert the image to a byte array
		byte[] imageBytes = ImageConverter.convertImageToByteArray(inputImagePath);

		// Check if conversion was successful
		if (imageBytes != null) {
			ImageConverter.writeByteArrayToImage(imageBytes, outputImagePath);

			// Verify if the new image is identical to the original
			if (ImageConverter.verifyImages(inputImagePath, outputImagePath)) {
				System.out.println("Verification successful: The new image is identical to the original.");
			}
			else {
				System.out.println("Verification failed: The images are not identical.");
			}
		}
		else {
			System.out.println("Failed to read the input image.");
		}
	}
}

