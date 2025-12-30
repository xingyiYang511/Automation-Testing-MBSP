import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://mbsphr-dev.veecotech.com.my/internal-login-hr');
  await page.getByPlaceholder('10001').click();
  await page.getByPlaceholder('10001').fill('99999');
  await page.getByPlaceholder('****').click();
  await page.getByPlaceholder('****').fill('mbsp');
  await page.getByPlaceholder('****').press('CapsLock');
  await page.getByPlaceholder('****').fill('mbspHR');
  await page.getByPlaceholder('****').press('CapsLock');
  await page.getByPlaceholder('****').fill('mbspHR999!!');
  await page.getByRole('button', { name: 'Log Masuk' }).click();
  await page.getByRole('link', { name: 'Kenaikan Pangkat' }).click();
  await page.getByRole('link', { name: 'Log Keluar' }).click();
});
