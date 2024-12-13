module.exports = {
  content: [
    './src/**/*.{js,jsx,ts,tsx}', // Ensures all files in the src directory are scanned
  ],
  theme: {
    extend: {
      // Custom Colors
      colors: {
        'primary-gradient-start': '#4f46e5', // Indigo
        'primary-gradient-end': '#9333ea',   // Purple
        'secondary-gradient-start': '#ec4899', // Pink
        'secondary-gradient-end': '#f43f5e',  // Red
      },
      // Custom Keyframes for Animations
      keyframes: {
        fadeIn: {
          '0%': { opacity: 0, transform: 'translateY(10px)' },
          '100%': { opacity: 1, transform: 'translateY(0)' },
        },
        pulseSlow: {
          '0%, 100%': { opacity: 1, transform: 'scale(1)' },
          '50%': { opacity: 0.9, transform: 'scale(1.05)' },
        },
      },
      // Custom Animations
      animation: {
        'fade-in': 'fadeIn 0.5s ease-out',
        'pulse-slow': 'pulseSlow 2s infinite',
      },
      // Fonts
      fontFamily: {
        sans: ['Inter', 'Sans-serif'], // Use Inter or fallback to sans-serif
      },
    },
  },
  plugins: [],
};
