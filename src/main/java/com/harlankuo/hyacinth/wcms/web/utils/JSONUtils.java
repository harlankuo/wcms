/*
 * This project constitutes a work of the United States Government and is
 * not subject to domestic copyright protection under 17 USC § 105.
 * 
 * However, because the project utilizes code licensed from contributors
 * and other third parties, it therefore is licensed under the MIT
 * License.  http://opensource.org/licenses/mit-license.php.  Under that
 * license, permission is granted free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the conditions that any appropriate copyright notices and this
 * permission notice are included in all copies or substantial portions
 * of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.harlankuo.hyacinth.wcms.web.utils;

import java.lang.reflect.Type;
import java.sql.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

/**
 * Gson utilities.
 */
public abstract class JSONUtils {
	// 定制化mapping
	private static SerializeConfig mapping = new SerializeConfig();
	static {
		mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
	}

	/**
	 * Convert object to json
	 * 
	 * @return json string
	 */
	public static final String toJson(final Object object) {
		return toJson(object, false);
	}

	/**
	 * Convert object to json
	 * 
	 * @return json string
	 */
	public static final String toJson(final Object object,
			final boolean includeNulls) {
		if (includeNulls) {
			return JSON.toJSONString(object, mapping,
					SerializerFeature.WriteMapNullValue);
		} else {
			return JSON.toJSONString(object, mapping);
		}
	}

	/**
	 * Convert string to given type
	 * 
	 * @return instance of type
	 */
	public static final <V> V fromJson(String json, Class<V> type) {
		return JSON.parseObject(json, type);
	}

	/**
	 * Convert string to given type
	 * 
	 * @return instance of type
	 */
	public static final <V> V fromJson(String json, Type type) {
		return JSON.parseObject(json, type);
	}
}